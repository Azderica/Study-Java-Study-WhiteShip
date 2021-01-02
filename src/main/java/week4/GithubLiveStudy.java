package week4;

import org.kohsuke.github.*;

import java.io.IOException;
import java.util.*;

public class GithubLiveStudy {
    private final String token = "token";
    private GitHub github;

    public static void main(String[] args) {
        GithubLiveStudy app = new GithubLiveStudy();

        try {
            app.run();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void run() throws IOException {
        connectGitApi();

        GHRepository ghRepository = github.getRepository("whiteship/live-study");
        Map<String, Integer> participant = new HashMap<>();
        List<GHIssue> issues = ghRepository.getIssues(GHIssueState.ALL);

        for (GHIssue issue : issues) {
            List<GHIssueComment> commentList = issue.getComments();

            Set<String> nameList = new HashSet<>();

            addParticipantInSet(commentList, nameList);

            for (String s : nameList) {
                hasParticipantInSet(participant, s);
            }
        }
        printParticipantRate(participant);
    }

    private void hasParticipantInSet(Map<String, Integer> participant, String s) {
        if (!participant.containsKey(s)) {
            participant.put(s, 1);
        } else {
            Integer integer = participant.get(s);
            participant.put(s, ++integer);
        }
    }

    private void addParticipantInSet(List<GHIssueComment> commentList, Set<String> name) throws IOException {
        for (GHIssueComment ghIssueComment : commentList) {
            name.add(ghIssueComment.getUser().getLogin());
        }
    }

    private void printParticipantRate(Map<String, Integer> participant) {
        participant.forEach((key, value) -> {
            double percent = (double) (value * 100) / 18;
            System.out.printf(key + "  :  " + "%.2f" +  percent+ "%");
        });
    }

    private void connectGitApi() throws IOException {
        github = new GitHubBuilder().withOAuthToken(token).build();
    }
}
