import java.util.Arrays;

public class Massiiv{

	
	static int leiaSuurim(int[] andmed){
		int suurim=andmed[0];
		int koht=1;
		while(koht<andmed.length){
			if(andmed[koht]>suurim){suurim=andmed[koht];}
			koht++;
		}
		return suurim;
	}

	static int leiaV2him(int[] andmed){
		int v2him=andmed[0];
		int koht=1;
		while(koht<andmed.length){
			if(andmed[koht]<v2him){v2him=andmed[koht];}
			koht++;
		}
		return v2him;
	}

	public static void main(String[] arg){
		int[] arvud = {1, 5, -3, 2, 25, -12, 0, 2};
		Arrays.sort(arvud);
		int[] j2rjestatud = new int [arvud.length];
		for(int i = 0, min = 0, max = arvud.length - 1; i < arvud.length; i += 1, min++, max--) {
			j2rjestatud[i] = arvud[min];
			if (i + 1 <j2rjestatud.length) {
                j2rjestatud[i + 1] = arvud[max];
			}
		}
		System.out.println("J2rjestatud massiiv: "+Arrays.toString(j2rjestatud));
		System.out.println("Suurim arv "+leiaSuurim(arvud));
		System.out.println("V2ikseim arv: "+leiaV2him(arvud));
		
	}
}
