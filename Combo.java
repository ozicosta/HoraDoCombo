 combinação de classe  pública {
     Burguer  privado ; _
     Sobremesa Sobremesa  Privada ;
     Bebida  bebida privada ;

    public  void  criarCombo ( String  nomeSanduiche , double  precoSanduiche ,
                           String  nomeSobremesa , double  precoSobremesa ,
                           String  nomeBebida , double  precoBebida ) {
        isso . burguer = new  Burguer ( nomeBurguer , precoBurguer );
        isso . sobremesa = new  Sobremesa ( nomeSobremesa , precoSobremesa );
        isso . bebida = new  Bebida ( nomeBebida , precoBebida );
    }

     public  void  mostrarItensDoCombo () {
        Sistema . fora . println ( "Sanduíche: " + hambúrguer . getNome () + " - R$" + hambúrguer . getPreco ());
        Sistema . fora . println ( "Sobremesa: " + sobremesa . getNome () + " - R$" + sobremesa . getPreco ());
        Sistema . fora . println ( "Bebida: " + bebida . getNome () + " - R$" + bebida . getPreco ());
    }
}
