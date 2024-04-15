# Week7
RentACar project
Araç Kiralama Projesi Bilgilendirme
Java ve Swing teknolojilerini kullanarak geliştirilecek araç kiralama projesi, java programlama bilgilerinizi pekiştirmenin yanında aynı zamanda veritabanı işlemleri ve kullanıcı arayüzü geliştirme konularında da önemli deneyimler kazanmanızı sağlayacak. Swing kullanarak arayüz tasarlamayı bu dersle birlikte pratik ediyor olacaksınız.

Swing, Java programlama dilinde GUI (Graphical User Interface - Grafiksel Kullanıcı Arayüzü) bileşenlerini oluşturmak ve yönetmek için kullanılan bir kütüphanedir. Kullanıcı arayüzü oluşturmak için geniş bir bileşen seti sunar. Bu bileşenler arasında düğmeler, metin alanları, liste kutuları, tablolar, menüler ve çeşitli diğer arayüz öğeleri bulunur. Swing, bu bileşenleri düzenlemek, olayları işlemek ve kullanıcı etkileşimlerini yönetmek için gelişmiş bir olay tabanlı model sunar.

Swing, masaüstü uygulamaları geliştirmek için ideal bir seçenektir. Web uygulamaları için genellikle kullanılmaz, çünkü bu tür uygulamalar genellikle tarayıcılar aracılığıyla çalışır ve Swing, tarayıcılarla uyumlu değildir. Swing, masaüstü uygulamaları geliştirmek için kullanılan birçok Java IDE'si ve geliştirme ortamı tarafından desteklenir.

Uygulamanıza görsellik katmak için swing kullanılacaktır. Odaklanılması gereken kısım ise backend tarafında yapılan veri tabanına bağlanma, veri tabanından veri okuma, yazma, güncelleme ve silme operasyonlarının nasıl yapıldığıdır.

Proje genel olarak dört ana modülden oluşur: entity, dao, business  ve view. Bu modüller projenin farklı katmanlarını temsil eder ve her biri belirli bir görevi yerine getirir.

• Entity Modülü

Veritabanı tablolarını ve bu tablolara ait varlık nesnelerini tanımlar.

Kullanıcı, marka, model, araç, rezervasyon gibi temel entity nesnelerini içerir.

Bu nesneler arasındaki ilişkileri belirler.

• DAO (Veri Erişim Nesnesi) Modülü

Veritabanı erişimi ve işlemleri için bir arayüz sağlar.

Entity modülündeki nesnelerin veritabanına kaydedilmesi, güncellenmesi ve silinmesi süreçlerini yönetir.

Veritabanından veri alma işlemlerini gerçekleştirir.

• Business Modülü

İş mantığını yönetir ve uygulama içindeki temel işlemleri gerçekleştirir. 

Fiyatlandırma ve araç kiralama hesaplamaları gibi iş mantığı operasyonlarını yönetir.

Veritabanı işlemleri için dao modülü ile etkileşime girer.

• View Modülü

Kullanıcı arayüzünü (UI) yönetir ve kullanıcıyla etkileşimi sağlar.

Araç listesi ve kiralama ekranı gibi kullanıcı bilgilerini gösterir.

Kullanıcının girdiği bilgileri iş katmanına ileterek işlemleri başlatır.

Bu modüller projenin katmanlı mimarisini oluşturarak kodun düzenli, modüler ve bakımı kolay olmasını sağlar. Entity nesnelerini,  veritabanı erişimini, iş mantığını ve kullanıcı arayüzünü ayrı ayrı ele almak, geliştirme sürecini daha yönetilebilir hale getirir ve ek işlevler eklemeyi kolaylaştırır.

Projenin temel isterleri şunlardır:

Firmadaki tüm araçların sisteme kaydedilmesi.

Her araca ait plaka bilgilerinin tutulması.

Sistem üzerinden belirli kriterlere göre uygun ve müsait araçların listelenmesi.

Rezervasyon işleminin yapılması.

Yani, kullanıcılar belirli bir tarih aralığındaki araçların müsaitlik durumlarını kontrol edebilecekler. Örneğin, "Renault Clio" veya "Volkswagen Polo" gibi kriterlere göre arama yapabilecekler ve uygun araçlardan rezervasyon yapabilecekler.
