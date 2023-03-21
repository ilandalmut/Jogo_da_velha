package jogo_da_velha;

import java.util.Scanner;

public class Jogo_da_velha {
    
    public static void main(String[] args) { /*Atividade realizada na IDE netbeans*/
			
		Scanner imput = new Scanner(System.in);
			
		String jogo[][] = new String [3][3]; /*matriz de 3x3*/
		jogo[0][0] = "1"; /*números que iram fazer a ação de X e O, esses números iram receber essas posições da matriz*/
		jogo[0][1] = "2";
		jogo[0][2] = "3";
		jogo[1][0] = "4";
		jogo[1][1] = "5";
		jogo[1][2] = "6";
		jogo[2][0] = "7";
		jogo[2][1] = "8";
		jogo[2][2] = "9";
		System.out.println("\n"+jogo[0][0]+"\t"+jogo[0][1]+"\t"+jogo[0][2]+"\n"+jogo[1][0]+"\t"+jogo[1][1]+"\t"+jogo[1][2]+"\n"+jogo[2][0]+"\t"+jogo[2][1]+"\t"+jogo[2][2]); /*vai mostrar as posições no console/terminal*/
		System.out.print("\n Por favor, digite o nome do jogador X: ");
		String nomex = imput.nextLine(); /*recebe o nome do jogador X*/
		System.out.print("\n Por favor, digite o nome do jogador O: ");
		String nomeo = imput.nextLine(); /*recebe o nome do jogador O*/
		System.out.println("\n O jogo começou! \n");
			
		int p = 0, n = 0; /*posições para ganhar e o número de rodadas*/
		String s; /*string de valores a serem recebidos*/
		String i1,i2,i3; /*linha*/
		String j1,j2,j3; /*coluna*/
		String d1,d2; /*diagonal*/
		while(n<=9)/*laço de repetição que define até que número vai a jogada*/ {
			i1 = jogo[0][0]+jogo[0][1]+jogo[0][2]; /*possibilidades de vitória!!!*/
			i2 = jogo[1][0]+jogo[1][1]+jogo[1][2];	
			i3 = jogo[2][0]+jogo[2][1]+jogo[2][2];
				
			j1 = jogo[0][0]+jogo[1][0]+jogo[2][0];
			j2 = jogo[0][1]+jogo[1][1]+jogo[2][1];
			j3 = jogo[0][2]+jogo[1][2]+jogo[2][2];
				
			d1 = jogo[0][0]+jogo[1][1]+jogo[2][2];
			d2 = jogo[2][0]+jogo[1][1]+jogo[0][2];
				
			if(i1.equals("XXX") || i2.equals("XXX") || i3.equals("XXX") || j1.equals("XXX") || j2.equals("XXX") || j3.equals("XXX") || d1.equals("XXX") || d2.equals("XXX")) /*possibilidades de X vencer*/ {
				System.out.println("\n X jogador "+nomex+" venceu!!!"); /*mostra vitória do X*/
				break; /*para de rodar o jogo caso o X vença*/
			}
			if(i1.equals("OOO") || i2.equals("OOO") || i3.equals("OOO") || j1.equals("OOO") || j2.equals("OOO") || j3.equals("OOO") || d1.equals("OOO") || d2.equals("OOO")) /*possibilidades de O vencer*/ {
				System.out.println("\n O jogador "+nomeo+" venceu!!!"); /*mostra vitória do O*/
				break; /*para de rodar o jogo caso o O vença*/
			}
			if(n % 2 == 0) /*define quem é X e quem é O*/ {
				s = "X"; /*primeira rodada é do X*/
			} else {
				s = "O"; /*segunda rodada é do O*/
			}
			if (n>8) /*critério de empate*/ {
				System.out.println("\n EMPATE!"); /*mostra o empate no console/terminal*/
				break; /*para o jogo*/
			} else /*posição inserida*/{
				p = imput.nextInt(); /*vai receber a proxima jogada*/
			}
			if (p == 1&&(jogo[0][0].equals("1"))) /*capiturar a tecla digitada, nesse caso a tecla 1(fiz isso para que não seja possivel digitar a tecla 1 novamente)*/ {
				jogo[0][0] = s; /*subistitui o valor 1 por s, sabendo agora a vez de X e O.*/
				System.out.println("\n"+jogo[0][0]+"\t"+jogo[0][1]+"\t"+jogo[0][2]+"\n"+jogo[1][0]+"\t"+jogo[1][1]+"\t"+jogo[1][2]+"\n"+jogo[2][0]+"\t"+jogo[2][1]+"\t"+jogo[2][2]); /*vai mostrar no console/terminal*/
				n++; /*saber em qual rodada está(contador de rodada).*/
				continue; /*isso é para não parar o jogo*/
			}
			if (p == 2&&(jogo[0][1].equals("2"))) /*capiturar a tecla digitada*/ {
					jogo[0][1] = s; /*subistitui o valor 2 por s, sabendo agora a vez de X e O.*/
				System.out.println("\n"+jogo[0][0]+"\t"+jogo[0][1]+"\t"+jogo[0][2]+"\n"+jogo[1][0]+"\t"+jogo[1][1]+"\t"+jogo[1][2]+"\n"+jogo[2][0]+"\t"+jogo[2][1]+"\t"+jogo[2][2]); /*vai mostrar no console/terminal*/
				n++; /*saber em qual rodada está(contador de rodada).*/
				continue; /*isso é para não parar o jogo*/
			}
			if (p == 3&&(jogo[0][2].equals("3"))) /*capiturar a tecla digitada*/ {
				jogo[0][2] = s; /*subistitui o valor 3 por s, sabendo agora a vez de X e O.*/
				System.out.println("\n"+jogo[0][0]+"\t"+jogo[0][1]+"\t"+jogo[0][2]+"\n"+jogo[1][0]+"\t"+jogo[1][1]+"\t"+jogo[1][2]+"\n"+jogo[2][0]+"\t"+jogo[2][1]+"\t"+jogo[2][2]); /*vai mostrar no console/terminal*/
				n++; /*saber em qual rodada está(contador de rodada).*/
				continue; /*isso é para não parar o jogo*/
			}
			if (p == 4&&(jogo[1][0].equals("4"))) /*capiturar a tecla digitada*/ {
				jogo[1][0] = s; /*subistitui o valor 4 por s, sabendo agora a vez de X e O.*/
				System.out.println("\n"+jogo[0][0]+"\t"+jogo[0][1]+"\t"+jogo[0][2]+"\n"+jogo[1][0]+"\t"+jogo[1][1]+"\t"+jogo[1][2]+"\n"+jogo[2][0]+"\t"+jogo[2][1]+"\t"+jogo[2][2]); /*vai mostrar no console/terminal*/
				n++; /*saber em qual rodada está(contador de rodada).*/
				continue; /*isso é para não parar o jogo*/
			}
			if (p == 5&&(jogo[1][1].equals("5"))) /*capiturar a tecla digitada*/ {
				jogo[1][1] = s; /*subistitui o valor 5 por s, sabendo agora a vez de X e O.*/
				System.out.println("\n"+jogo[0][0]+"\t"+jogo[0][1]+"\t"+jogo[0][2]+"\n"+jogo[1][0]+"\t"+jogo[1][1]+"\t"+jogo[1][2]+"\n"+jogo[2][0]+"\t"+jogo[2][1]+"\t"+jogo[2][2]); /*vai mostrar no console/terminal*/
				n++; /*saber em qual rodada está(contador de rodada).*/
				continue; /*isso é para não parar o jogo*/
			}
			if (p == 6&&(jogo[1][2].equals("6"))) /*capiturar a tecla digitada*/ {
				jogo[1][2] = s; /*subistitui o valor 6 por s, sabendo agora a vez de X e O.*/
				System.out.println("\n"+jogo[0][0]+"\t"+jogo[0][1]+"\t"+jogo[0][2]+"\n"+jogo[1][0]+"\t"+jogo[1][1]+"\t"+jogo[1][2]+"\n"+jogo[2][0]+"\t"+jogo[2][1]+"\t"+jogo[2][2]); /*vai mostrar no console/terminal*/
				n++; /*saber em qual rodada está(contador de rodada).*/
				continue; /*isso é para não parar o jogo*/
			}
			if (p == 7&&(jogo[2][0].equals("7"))) /*capiturar a tecla digitada*/ {
				jogo[2][0] = s; /*subistitui o valor 7 por s, sabendo agora a vez de X e O.*/
				System.out.println("\n"+jogo[0][0]+"\t"+jogo[0][1]+"\t"+jogo[0][2]+"\n"+jogo[1][0]+"\t"+jogo[1][1]+"\t"+jogo[1][2]+"\n"+jogo[2][0]+"\t"+jogo[2][1]+"\t"+jogo[2][2]); /*vai mostrar no console/terminal*/
				n++; /*saber em qual rodada está(contador de rodada).*/
				continue; /*isso é para não parar o jogo*/
			}
			if (p == 8&&(jogo[2][1].equals("8"))) /*capiturar a tecla digitada*/ {
				jogo[2][1] = s; /*subistitui o valor 8 por s, sabendo agora a vez de X e O.*/
				System.out.println("\n"+jogo[0][0]+"\t"+jogo[0][1]+"\t"+jogo[0][2]+"\n"+jogo[1][0]+"\t"+jogo[1][1]+"\t"+jogo[1][2]+"\n"+jogo[2][0]+"\t"+jogo[2][1]+"\t"+jogo[2][2]); /*vai mostrar no console/terminal*/
				n++; /*saber em qual rodada está(contador de rodada).*/
				continue; /*isso é para não parar o jogo*/
			}
			if (p == 9&&(jogo[2][2].equals("9"))) /*capiturar a tecla digitada*/ {
				jogo[2][2] = s; /*subistitui o valor 9 por s, sabendo agora a vez de X e O.*/
				System.out.println("\n"+jogo[0][0]+"\t"+jogo[0][1]+"\t"+jogo[0][2]+"\n"+jogo[1][0]+"\t"+jogo[1][1]+"\t"+jogo[1][2]+"\n"+jogo[2][0]+"\t"+jogo[2][1]+"\t"+jogo[2][2]); /*vai mostrar no console/terminal*/
				n++; /*saber em qual rodada está(contador de rodada).*/
				continue; /*isso é para não parar o jogo*/
			}
			else {
				System.out.println("A posição "+p+" já está preenchida. Por favor, digite outro algarismo: "); /*mostra no console/terminal que determinada posição já está preenchida por X ou O*/
				continue; /*isso é para não parar o jogo*/
			}
		}
        }                       /*pelo número da rodada o sistema vai saber quem é X e O.*/
    
}
