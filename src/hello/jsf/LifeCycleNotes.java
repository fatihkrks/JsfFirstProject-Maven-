package hello.jsf;

public class LifeCycleNotes {

	
	//1> restore view
	//bir jsf sayfasına istek geldiğinde bu faz çalışır .
	//sayfa ilk açıldığında restore view fazı çalışır .
	
	
	//ilk istek geldiğinde component tree oluşur .
	//bu fazı 2 ye ayırabiliriz :
	//a-non postback request /initial request
	// direkt olarak restore view  fazından -> render response faza geçiş olur .
	//burada herhangi bir form submit datası yok 
	//b-postback request
	//Post ile formu/datayı submit ettiğimiz durumda ortaya çıkar 
	
	//>2> Apply Request Values 
	// forma yazmış olduğumuz datalar ,component treedeki her bir node a bağlanır .(assign edilir .)
	
	//3>  Process Validation
	//componnet tree de iligli data yer almakta 
	//h:inputtext için ->levent değeri yazdım gönderdim,bu değerlere local value adı verilir .
	//bir validation yapılmakta(doğrulama) . burada bir problem yoksa lifecycle devam eder .
	//aksi durumda lifecycle son bulur .render response fazına geçilir .iligili hata mesajları eklenir .
	
	//4-> Update model values 
	//local valueler -> component tree deki ilgili objede duran form alanında yazmış olduğumuz değerler
	//umv fazında bu local valuelar ilgili managedbeandeki propertylere bin edilir/bağlanır .set edilir/güncellernir .
	
	//5-ınvoke application
	//beanler güncellendi .action codeları çalışır
	//h:commandbutton action="welcome.xhmtl" ->
	//bu fazda her şey yolundaysa action kısmı yapılır ,navigation yapılır .
	
	//6->render response
	//lifecyclda son faz .
	//encoding ve render işlem fazı
	//jsf componentleri html componentlerine dönüşür 
}
