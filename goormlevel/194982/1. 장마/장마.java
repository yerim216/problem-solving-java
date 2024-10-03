import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int[] h = new int[n+1];
		List<int[]> rain = new ArrayList<>();
		
		st = new StringTokenizer(br.readLine());
		for(int i=1; i<=n; i++){
			h[i] = Integer.parseInt(st.nextToken());
		}
		for(int i=1; i<=m; i++){
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			rain.add(new int[]{s, e});
			
			//System.out.println();
			for(int j=s; j<=e; j++){
				h[j]++;
			}
			// for(int q=1; q<=n; q++){
			// 	System.out.print(h[q]);
			// }
			if(i%3==0){
				boolean[] flush = new boolean[n+1];
				for(int k=i; k>=i-2; k--){
					int[] past = rain.get(k-1);
					int start = past[0];
					int end = past[1];
					//System.out.println(start + " " + end);
					for(int b=start; b<=end; b++){
						if(!flush[b]){
							flush[b] = true;
						}
					}
					
					
					
				}
				for(int f = 1; f<= n; f++){
						//System.out.print(flush[f]);
						if(flush[f]){
							h[f]--;
						}
					}
				// System.out.print("배수");
				// for(int q=1; q<=n; q++){
					
				// 	System.out.print(h[q]);
				// }
				// System.out.println();
			}
			
		}
		for(int i=1; i<=n; i++){
			sb.append(h[i]).append(" ");
		}
		System.out.println(sb);
	}
}