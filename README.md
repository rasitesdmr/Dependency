                                      Dependencies and Dependency Injection ?

Bir sınıf içerisinde başka bir sınıfın nesnesini kullanacağız bunu new anahtar sözcüğüyle oluşturmamamız gerek.

Eğer new lersek bu iki sınıfı birbirine bağlamış oluruz .

Bir değişiklik yapmamız gerektiğinde her iki sınıfada uygulmamamız gerek.

Bunun yerine gerken nesneyi Constructor dan ya da Setter metoduyla parametre olarak almalıyız .

Böylece her iki sınıf aralarında gevşek bağlılık oluşur.Yani yeni bir özellik ekleyip çıkartmayı kolaylaştırır.

->Dependency injection , bağımlılıkları soyutlamak demektir . 
