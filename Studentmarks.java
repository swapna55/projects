public class Studentmarks
{
public static void main(String[] args)
{
int[][] marks=new int[2][4];
for(int i=0;i<marks.length;i++)
{
for(int j=0;j<marks[i].length;j++)
{
marks[i][j]=(int)(Math.random()*100);
}
}
for(int i=0;i<marks.length;i++)
{
for(int j=0;j<marks.length;j++)
{
System.out.println("marks in subject:"+marks[i][j]);
}
}
}
}