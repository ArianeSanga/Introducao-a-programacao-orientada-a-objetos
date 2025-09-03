    import java.util.Scanner;

        public class Exercicio18 {

            public static void main(String[]args){

                Scanner console = new Scanner(System.in);
            
                int idade;
                char sexo;
                double salario;

                int qtde = 0;
                double soma_salario=0.0;
                
                final int max_idade = 150;
                final int min_idade = -1;
                int menor_idade = max_idade;
                int maior_idade = min_idade;

                int  qtde_f200 = 0;

                boolean prossiga;


                System.out.printf("informe a idade(anos,negativo para finalizar)");
                idade = console.nextInt();

                if(idade>0){
                    prossiga = true;
                }else{
                    prossiga = false;        
                }

                while( prossiga == true){
                     System.out.printf("Informe o sexo:\n");
                     sexo = console.next().charAt(0);

                     System.out.printf("Digite seu salario: ");
                     salario = console.nextDouble();
                     
                     qtde =qtde + 1;
                     soma_salario+=soma_salario;

                     if(idade<menor_idade){
                       menor_idade = idade;                
                     }
                     if(idade>maior_idade){
                       maior_idade = idade;
                     }

                    if(sexo=='f' && salario>200){
                        qtde_f200++;                    
                    }
                     
                }
                System.out.printf("coleta finalizada!\n");

                if(qtde != 0){
                    System.out.printf("A média do grupo é: %f\n",soma_salario/qtde);   
                    System.out.printf("a menor idade do grupo é %f\n",menor_idade);
                    System.out.printf("a maior idade do grupo é %f\n",maior_idade);  
                    System.out.printf("a quantidade de mulheres com salario inferior é:%f\n",qtde_f200);       
                }

                
            System.out.printf("informe a idade(anos,negativo para finalizar)");
            idade = console.nextInt();

            if(idade>0){
                prossiga = true;
            }else{
                prossiga = false;        
            }

       

            console.close();
                
            }
        } 
