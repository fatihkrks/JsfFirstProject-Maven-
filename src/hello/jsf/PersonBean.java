package hello.jsf;

import javax.faces.bean.ManagedBean;

//POJO --> plain old java object ->private property/instance değişkenler,public getter setter ,no-arg constructor bu yapıdaki
//classlar pojo
//Bean -->pojunun farklı framworklardeki ismi;
//JSF -> managed bean
//JPA -> entity bean
//Spring -> bean
//Managed Bean -> jsf tarafından kullanılan/yönetilen/ulaşılan beanlar/pojolar 
@ManagedBean
public class PersonBean {
		private String name;
		private String password;
		
		
		public PersonBean() {
			super();
		}
		public PersonBean(String name, String password) {
			super();
			this.name = name;
			this.password = password;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		
		
}
