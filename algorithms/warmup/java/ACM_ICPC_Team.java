import java.io.*;

public class Solution {

    public static void main(String[] args) throws IOException {

        //INPUT
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input[] = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        byte[][] topics = new byte[N][M];
        for(int i = 0; i < N; ++i){
            char[] arr = br.readLine().toCharArray();
            for(int j = 0; j < M; ++j){
                topics[i][j] = (byte)(arr[j] - '0');
            }
        }

        //SOLVE
        int numTeams = 0;
        int maxTopics = 0;
        for(int i = 0; i < N; ++i){
            for(int j = i+1; j < N; ++j){
                int numTopics = 0;
                for(int k = 0; k < M; ++k){
                    numTopics += topics[i][k] | topics[j][k];
                }
                if (maxTopics < numTopics){
                    numTeams = 1;
                    maxTopics = numTopics;
                } else if(maxTopics == numTopics){
                    ++numTeams;
                }
            }
        }

        //OUTPUT
        System.out.println(maxTopics);
        System.out.print(numTeams);
    }
}