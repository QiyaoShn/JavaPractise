package shuZu;

import java.util.Arrays;
import java.util.Scanner;

public class shuZu {
	public static void main(String[] args) {
		int x,i; 
		int y[]= {0};  
		shuZu Word1=new shuZu(); 
		String word4[]= {"work","back","come","deal",
				"book","java","tool","face"};
		String word5[]= {"watch","match","noise","risky","stock"};
		
		Scanner sc = new Scanner(System.in);
		x=sc.nextInt();
		for(i=0;x!=0;i++){
			y=Arrays.copyOf(y, y.length+1);
			y[y.length-1]=x;
			x=sc.nextInt();
		}
		sc.close();
		int j,k,l,z=0;
		String outWord[]={""};
		String isWord[]={""};
		String m[]= {""};
		if(y.length==5) {
			m=Arrays.copyOf(m, word4.length);
			m=word4;
			for(i=0;i<4;i++){
				isWord=Arrays.copyOf(isWord, isWord.length+4);
				isWord[4]=Word1.wordReturn(y[4], i);
				for(j=0;j<4;j++){
					isWord[3]=Word1.wordReturn(y[3], j);
					for(k=0;k<4;k++){
						isWord[2]=Word1.wordReturn(y[2], k);
						for(l=0;l<4;l++){
							isWord[1]=Word1.wordReturn(y[1], l);
							outWord=Arrays.copyOf(outWord,outWord.length+1);
							outWord[outWord.length-1]=isWord[1]+isWord[2]+isWord[3]+isWord[4];
						}
					}
				}
			}
		}else if(y.length==6) {
			m=Arrays.copyOf(m, word5.length);
			m=word5;
			for(z=0;z<4;z++) {
				isWord=Arrays.copyOf(isWord, isWord.length+5);
				isWord[5]=Word1.wordReturn(y[5], z);
				for(i=0;i<4;i++){
					isWord[4]=Word1.wordReturn(y[4], i);
					for(j=0;j<4;j++){
						isWord[3]=Word1.wordReturn(y[3], j);
						for(k=0;k<4;k++){
							isWord[2]=Word1.wordReturn(y[2], k);
							for(l=0;l<4;l++){
								isWord[1]=Word1.wordReturn(y[1], l);
								outWord=Arrays.copyOf(outWord,outWord.length+1);
								outWord[outWord.length-1]=isWord[1]+isWord[2]+isWord[3]+isWord[4]+isWord[5];
							}
						}
					}
				}
			}
		}else {
			System.out.println("没有匹配单词");
		}
		
		for(i=0;i<outWord.length;i++) {
			for(j=0;j<m.length;j++) {
				if(outWord[i].equals(m[j])) {
					System.out.println(outWord[i]);
					break;
				}
			}
		}
		if(i>outWord.length)
			System.out.println("没有匹配单词");
	}
	String wordReturn(int num,int i) {
		String word=" ";
		String word2[]={"a","b","c",""};
		String word3[]={"d","e","f",""};
		String word4[]={"g","h","i",""};
		String word5[]={"j","k","l",""};
		String word6[]={"m","n","o",""};
		String word7[]={"p","q","r","s"};
		String word8[]={"t","u","v",""};
		String word9[]={"w","x","y","z"};
		switch (num) {
		case 2: word=word2[i];
		break;
		case 3: word=word3[i];
		break;
		case 4: word=word4[i];
		break;
		case 5: word=word5[i];
		break;
		case 6: word=word6[i];
		break;
		case 7: word=word7[i];
		break;
		case 8: word=word8[i];
		break;
		case 9: word=word9[i];
		break;
		}
		return word;
	}
}
