# NET 365 — TP1 : Architecture réseau et routage avancé

**Étudiant :** KOUDADZE Kodjogan Josias  
**Institut :** IPNET Institute of Technology  
**Filière / Groupe :** L2G2 (NET 365)  
**Module :** NET 365 — Architecture réseau et routage avancé  
**Étude de cas :** Entreprise TECHNOVA  

## Description

Travaux dirigés et pratiques des Semaines 1 et 2 :

- **Partie A (Semaine 1)** : Conception du réseau (OSI/TCP-IP, VLSM, configuration IOS, IPv6, SDN/Zero Trust)
- **Partie B (Semaine 2)** : Routage statique, routes flottantes, migration vers EIGRP AS 200, DUAL, résilience

## Contenu du dossier

```
NET365/TP1/
├── README.md
├── PartieA.gns3                   # Projet GNS3 Partie A
├── PartieB.gns3                   # Projet GNS3 Partie B (statique + flottante)
├── PartieB_EIGRP.gns3             # Projet GNS3 Partie B (EIGRP AS 200)
└── configs/
    ├── PartieA/
    │   ├── R1.cfg
    │   └── R2.cfg
    ├── PartieB/
    │   ├── R1.cfg … R4.cfg
    └── PartieB_EIGRP/
        ├── R1.cfg … R4.cfg
```

## Plan d’adressage (Partie A – résumé)

| Segment        | CIDR              | Masque          | 1re IP utilisable | Dernière IP     | Broadcast       |
|----------------|-------------------|-----------------|-------------------|-----------------|-----------------|
| Administration | 192.168.10.0/26   | 255.255.255.192 | 192.168.10.1      | 192.168.10.62   | 192.168.10.63   |
| Informatique   | 192.168.10.64/27  | 255.255.255.224 | 192.168.10.65     | 192.168.10.94   | 192.168.10.95   |
| Commercial     | 192.168.10.96/27  | 255.255.255.224 | 192.168.10.97     | 192.168.10.126  | 192.168.10.127  |
| Serveurs       | 192.168.10.128/28 | 255.255.255.240 | 192.168.10.129    | 192.168.10.142  | 192.168.10.143  |
| Liaison R1–R2  | 192.168.10.144/30 | 255.255.255.252 | 192.168.10.145    | 192.168.10.146  | 192.168.10.147  |

## Plan d’adressage (Partie B)

| Équipement / interface | Adresse/préfixe |
|------------------------|-----------------|
| R1 vers R2             | 10.10.12.1/30   |
| R2 vers R1             | 10.10.12.2/30   |
| R2 vers R4             | 10.10.24.1/30   |
| R4 vers R2             | 10.10.24.2/30   |
| R1 vers R3             | 10.10.13.1/30   |
| R3 vers R1             | 10.10.13.2/30   |
| R3 vers R4             | 10.10.34.1/30   |
| R4 vers R3             | 10.10.34.2/30   |
| R1 vers LAN-SIÈGE      | 192.168.10.1/24 |
| R4 vers LAN-SERVICES   | 192.168.20.1/24 |
| R4 vers LAN-APP        | 192.168.30.1/24 |

## Simulateur

- GNS3 + Dynamips (routeurs Cisco 7200 – IOS 12.4)
- VPCS pour les postes
- Interfaces : FastEthernet (Fa0/0, Fa1/0, Fa1/1)

## Livrables

1. Fichiers de simulation GNS3 (Partie A et Partie B)
2. Configurations IOS finales (fichiers .cfg)
3. Rapport PDF complet (justifications techniques, tableaux, tests ping/traceroute, synthèse) — disponible localement dans le package étudiant

---

*KOUDADZE Kodjogan Josias – IPNET Institute of Technology – Novembre 2026*
