package com.example.demo2.cdi;

import javax.enterprise.context.*;
import javax.inject.Named;
import java.io.Serializable;

//Kapsam
//Oluşturulan projenin yaşam süresi
//Performansı + - etkiler
@Named
//@ApplicationScoped //büün uygulama boyunca çalışır
//@RequestScoped // 1 istek boyunca
//@SessionScoped // 1 kullanıcı için yaşar ancak logout sonlanır
@Dependent //bukelemun . Çağırdığımız yere göre scopped alır
//@ConversationScoped //belli istek boyunca yaşar. ürünü sepete ekledikten sonra ödemesini yapınca ölsün.
public class _00_Scoped implements Serializable {


}
