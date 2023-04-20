importar  java . . _ Scanner ;

public  class  Principal {
    public  static  void  principal ( String [] args ) {
                Sistema . fora . println ( "Selecione seu combo" );
                Sistema . fora . println ( "1. Mestre Combo" );
                Sistema . fora . println ( "2. Super Combo" );
                Sistema . fora . print ( "Sua escolha: " );

                 Entrada do scanner = novo  Scanner ( System . in );

                int  tipo = entrada . proximoInt ();

                Combo  combo = novo  Combo ();

               alternar ( tipo ) {
                    caso  1 :
                        combo . criarCombo ( "X-Burguer" , 12.5 , "Sundae" , 6.0 , "Coca-Cola" , 4.0 );
                        quebrar ;
                    caso  2 :
                        combo . criarCombo ( "Double Cheeseburguer" , 15.5 , "McFlurry" , 7.5 , "Fanta Laranja" , 4.0 );
                        quebrar ;
                    padrão :
                        Sistema . fora . println ( "Opção inválida" );
                        retorno ;
                }

                combo . mostrarItensDoCombo ();
            }
}
