Keycloak avec Spring Boot

Ce projet intègre Keycloak avec Spring Boot pour gérer l’authentification et les autorisations des utilisateurs.

📌 Technologies utilisées

Spring Boot

Keycloak

Spring Security

OAuth2

H2 Database (base de données en mémoire pour les tests)

Docker (pour exécuter Keycloak)

🚀 Installation et démarrage

1️⃣ Lancer Keycloak avec Docker

Exécute la commande suivante pour démarrer un conteneur Keycloak avec un utilisateur administrateur :
<img width="431" alt="image" src="https://github.com/user-attachments/assets/238f1137-4708-4480-8ed0-a883bc77676c" />

Une fois Keycloak lancé, accède à l’interface d’administration :

URL : http://localhost:8180/admin

Identifiants : admin / admin

2️⃣ Configuration du Realm dans Keycloak

Dans Keycloak, crée un Realm appelé myrealm et ajoute un Client nommé myclient avec :

Access Type : public

Valid Redirect URIs : http://localhost:9090/*

<img width="925" alt="Capture d’écran 2025-02-24 180941" src="https://github.com/user-attachments/assets/14a66caf-e4a4-42f7-9f8e-6808d5a11516" />

Ajoute un utilisateur nommé myuser et attribue-lui des rôles si nécessaire.
<img width="950" alt="Capture d’écran 2025-02-24 181248" src="https://github.com/user-attachments/assets/c265d17b-dc22-4296-a07a-18768c07084f" />

3️⃣ Configuration Spring Boot

Le fichier application.properties est configuré ainsi :
<img width="656" alt="image" src="https://github.com/user-attachments/assets/93dd0bf6-71bf-4fe0-a9de-002c8d46ebb0" />

4️⃣ Lancer l’application Spring Boot

Exécute la commande suivante :
<img width="247" alt="image" src="https://github.com/user-attachments/assets/4bd252c0-dc15-431a-b4a5-dcb7eb1ecd10" />

L’application sera accessible à http://localhost:9090.

📄 Fonctionnalités

Authentification via Keycloak

Protection des routes avec Spring Security

Base de données H2 pour stocker temporairement des informations

Page product.html pour lister les produits (protégée par Keycloak)

Gestion des produits avec :

ProductDto

Product (Entité JPA)

ProductService (Service métier)

ProductRepository (Interface JPA)

ProductMapper (Mapper entre entité et DTO)
🔒 Configuration de la sécurité

Le fichier SecurityConfig.java contient la configuration suivante :
<img width="751" alt="image" src="https://github.com/user-attachments/assets/39f64608-f74d-4e06-9708-6b514f9407df" />
<img width="863" alt="image" src="https://github.com/user-attachments/assets/60e43637-adf5-49f3-a9f3-a948ded64c54" />

🔄 Redirection automatique vers Keycloak

Lorsqu’un utilisateur tente d’accéder à http://localhost:9090/products sans être authentifié, il est automatiquement redirigé vers Keycloak pour se connecter avec les identifiants définis dans le Realm myrealm.
🖼️ Captures d’écran
<img width="956" alt="Capture d’écran 2025-02-24 181921" src="https://github.com/user-attachments/assets/ca4c70f4-455a-4217-9391-151502409fd1" />

<img width="959" alt="Capture d’écran 2025-02-24 181954" src="https://github.com/user-attachments/assets/b9313093-4640-442a-9434-591edbe6d3ea" />







