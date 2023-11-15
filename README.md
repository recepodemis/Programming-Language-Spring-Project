# Programming-Language-Spring-Project-API

Bu proje, Spring Boot ve Spring Data JPA kullanılarak geliştirilmiş bir dil yönetimi uygulamasını içerir. Aşağıda proje bileşenleri ve API endpoint'leri bulunmaktadır.

## Proje Bileşenleri

### 1. LanguageController

`LanguageController`, dil yönetimi ile ilgili API endpoint'lerini sağlar.

- `GET /api/language`: Tüm dilleri getirir.
- `POST /api/language`: Yeni bir dil ekler.
- `DELETE /api/language`: Belirli bir dilin silinmesini sağlar.
- `POST /api/language`: Belirli bir dilin güncellenmesini sağlar.

### 2. LanguageService

`LanguageService`, iş mantığı kurallarını içerir ve `LanguageController` tarafından çağrılır.

### 3. Model (Entity)

`Language` sınıfı, dil nesnesini temsil eder.

### 4. Model Mapper

`ModelMapperManager` sınıfı, DTO (Data Transfer Object) ve entity dönüşümlerini gerçekleştirmek için kullanılır.

## Nasıl Çalıştırılır

1. Projeyi bilgisayarınıza klonlayın.
2. Maven projeyi import edin.
3. `LanguageApplication` sınıfını çalıştırarak uygulamayı başlatın.
4. `http://localhost:8080` adresine giderek API'ları test edin.

## API Endpoint'leri

- `GET /api/language`: Tüm dilleri getirir.
- `POST /api/language/add`: Yeni bir dil ekler.
- `DELETE /api/language/delete`: Belirli bir dilin silinmesini sağlar.
- `POST /api/language/update`: Belirli bir dilin güncellenmesini sağlar.

## Kullanılan Teknolojiler

- Spring Boot
- Spring Data JPA
- Maven
- PostgreSQL
