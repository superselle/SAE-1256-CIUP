<p align="center">
  <img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=24&duration=3000&pause=1000&color=06C167&center=true&vCenter=true&width=500&lines=CIUP+Manager;Gestion+Campus+Universitaire;Logements+%2B+Restauration" alt="Typing SVG" />
</p>

<h1 align="center">🏰 <span style="color:#06C167;">CIUP Manager</span></h1>
<p align="center">🎓 L'application de gestion complète pour la Cité Internationale Universitaire de Paris.</p>

<p align="center">
  <img src="https://img.shields.io/badge/Status-Development-FF6B6B?style=for-the-badge&logo=tools&logoColor=white" alt="Status"/>
  <img src="https://img.shields.io/badge/Lang-Java_17+-007396?style=for-the-badge&logo=java&logoColor=white" alt="Java"/>
  <img src="https://img.shields.io/badge/GUI-Swing-E76F00?style=for-the-badge&logo=java&logoColor=white" alt="Swing"/>
  <img src="https://img.shields.io/badge/Pattern-MVC-purple?style=for-the-badge&logo=design&logoColor=white" alt="MVC"/>
</p>

---

### 🎯 À propos du projet

🚀 **CIUP Manager** est une solution logicielle Java destinée à l'administration centralisée de la Cité Internationale. Elle permet aux gestionnaires de piloter efficacement l'hébergement des étudiants et les services de restauration au sein du campus.

📊 **Pourquoi cette application ?**
* 🏠 **Gestion Immobilière** : Administration des différentes maisons (Internationale, France, Japon, Brésil, etc.) et de leur capacité.
* 🎓 **Suivi Étudiant** : Affectation des résidents, gestion de l'occupation et listes d'attente.
* 🍽️ **Service Restauration** : Gestion des menus, des restaurants universitaires et des types de repas.
* 💾 **Persistance** : Sauvegarde et restauration automatique des données via sérialisation.

> "Simplifiez la vie du campus, de l'inscription à la restauration."

---

### 🛠️ Stack Technique

<div align="center">

**💡 Core & Backend**
  
![Java](https://img.shields.io/badge/Java-JDK_17+-007396?style=for-the-badge&logo=java&logoColor=white)
![Serialization](https://img.shields.io/badge/Data-Serialization-gray?style=for-the-badge&logo=json&logoColor=white)
![Collections](https://img.shields.io/badge/Lib-Java_Collections-orange?style=for-the-badge&logo=java&logoColor=white)

**🎨 Interface & Architecture**

![Swing](https://img.shields.io/badge/GUI-Swing-E76F00?style=for-the-badge&logo=java&logoColor=white)
![MVC](https://img.shields.io/badge/Architecture-MVC-purple?style=for-the-badge&logo=structure&logoColor=white)
![JUnit](https://img.shields.io/badge/Testing-JUnit_5-25A162?style=for-the-badge&logo=junit5&logoColor=white)

</div>

---

### 🚀 Fonctionnalités Clés

<div align="center">

### 🏘️ **Gestion des Hébergements**
> *Administration des pavillons et résidences*

- **Visualisation** : Liste des maisons avec taux d'occupation en temps réel.
- **Capacité** : Gestion dynamique du nombre de places disponibles.
- **International** : Support pour les maisons spécifiques (Japon, Brésil, Italie, etc.).

---

### 🎓 **Vie Étudiante**
> *Suivi des résidents*

- **Admission** : Enregistrement des nouveaux étudiants avec nationalité et dossier.
- **Attribution** : Placement intelligent dans les maisons selon les critères.
- **Liste d'attente** : Gestion automatique des étudiants en attente de logement.

---

### 🍽️ **Restauration**
> *Services de cantine et menus*

- **Menus** : Planification des repas (Entrée, Plat, Dessert).
- **Restaurants** : Gestion des différents points de restauration du campus.
- **Tarification** : Gestion des types de repas et services associés.

</div>

---

### 🏗️ Architecture du Projet

Le projet respecte scrupuleusement le pattern **Modèle-Vue-Contrôleur (MVC)**.

<div align="center">

```
Java/dev/src/                                                                 
├── 📁 mvc/                                                                   
│   ├── 📁 modele/                                            # Logique Métier
│   │   ├── 📁 batiment/                # Gestion des Maisons (Maison.java...)
│   │   ├── 📁 ciup/               # Cœur du système (CiteInternationale.java)
│   │   ├── 📁 gestion/                    # Logique d'attente et distribution
│   │   ├── 📁 service/            # Restauration (Restaurant.java, Menu.java)
│   │   └── 📁 utilisateur/                # Profils étudiants (Etudiant.java)
│   ├── 📁 vues/                                 # Interface Graphique (Swing)
│   │   └── 🐹 VueCiup.java                               # Fenêtre principale
│   ├── 📁 controleurs/                               # Gestion des événements
│   │   └── 🐹 ControleurCiup.java                                            
│   └── 🐹 ApplicationCIUP.java                        # Point d'entrée (Main)
└── 📁 serialisation/                                # Persistance des données
    ├── 🐹 GestionSauvegardeCite.java                                        
      └── ...                                                                     
```

</div>

---

### ⚡ Installation & Démarrage

#### 1. Prérequis
* **Java JDK 17** ou supérieur installé.
* Un IDE Java (Eclipse, IntelliJ, VS Code).

#### 2. Clonage & Importation
```bash
git clone https://github.com/superselle/SAE-1256-CIUP.git
```
Ouvrez le dossier `Java/dev` en tant que projet dans votre IDE.

#### 3. Lancement
Exécutez la classe principale :
`src/mvc/ApplicationCIUP.java`

L'application va :
1. Charger les données sauvegardées (si existantes).
2. Initialiser les maisons par défaut (si première exécution).
3. Ouvrir l'interface graphique de gestion.

---

### 👥 Équipe de Développement

| Membre | Rôle & Tests |
| :--- | :--- |
| **KALMAN Léo** | Développeur |
| **BOUZLAFA Selman** | Développeur & Tests (Package Batiment) |
| **GAMEIRO Soan** | Développeur |
| **HASSAN MOHAMED Yusuf** | Développeur |

---

### 📄 Licence

<div align="center">

Projet réalisé dans le cadre de la SAE "Développement d'Application" (S2).
Usage académique uniquement.

</div>

---

<p align="center">
  <img src="https://capsule-render.vercel.app/api?type=waving&color=0:141414,100:06C167&height=120&section=footer&text=CIUP%20Manager%20|%202026%20|%20Java%20Project&fontColor=ffffff&fontSize=18&animation=fadeIn" />
</p>
