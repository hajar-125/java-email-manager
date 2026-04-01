<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=flat&logo=openjdk&logoColor=white"/>
  <img src="https://img.shields.io/badge/JavaMail-ED8B00?style=flat&logo=openjdk&logoColor=white"/>
  <img src="https://img.shields.io/badge/Swing-007396?style=flat&logo=java&logoColor=white"/>
  <img src="https://img.shields.io/badge/SMTP-0078D4?style=flat&logo=microsoftoutlook&logoColor=white"/>
</p>

<h1 align="center">📬 Java Email Manager</h1>

<p align="center">
  A desktop email management application built in Java with a clean Swing GUI,
  supporting multiple accounts, real-time inbox reading, and scheduled email sending.
</p>

<p align="center">
  <img src="https://img.shields.io/badge/status-complete-brightgreen?style=flat"/>
  <img src="https://img.shields.io/badge/license-MIT-blue?style=flat"/>
  <img src="https://img.shields.io/badge/language-Java-orange?style=flat"/>
</p>

---

## 📌 Overview

This desktop application allows users to manage multiple email accounts from a single interface. Built entirely in Java using **JavaMail API** and **Swing**, it supports composing, sending, scheduling, and receiving emails — all through a clean graphical interface without any web browser.

---

## ✨ Features

- **Multi-account login** — connect multiple email accounts simultaneously
- **Compose & send** — write and send emails immediately via SMTP
- **Scheduled sending** — set a future date and time for automatic delivery
- **Inbox reading** — fetch and display received emails via IMAP/POP3
- **Dashboard view** — overview of all accounts and activity
- **Clean Swing GUI** — fully graphical desktop interface, no terminal needed

---

## 🗂 Project structure
```
JAVA_MAIL_MANAGER/
│
├── MailManager/
│   ├── src/
│   │   ├── Main.java                # Application entry point
│   │   ├── LoginFrame.java          # Login screen UI
│   │   ├── DashboardFrame.java      # Main dashboard UI
│   │   ├── ComposeFrame.java        # Email composition window
│   │   ├── EmailSender.java         # SMTP sending logic
│   │   ├── EmailReceiver.java       # IMAP/POP3 receiving logic
│   │   └── SchedulerService.java    # Scheduled email service
│   │
│   └── lib/
│       ├── javax.mail-1.6.2.jar     # JavaMail implementation
│       └── javax.mail-api-1.6.2.jar # JavaMail API
│
├── compile.sh      # Compilation script
├── run.sh          # Run script
├── setup.sh        # Setup script
└── README.md
```

---

## 🚀 Getting started

### Prerequisites
- Java JDK 8 or higher
- Gmail account with **App Password** enabled (if using Gmail)

### Enable Gmail App Password
1. Go to your Google Account → Security
2. Enable **2-Step Verification**
3. Go to **App Passwords** → generate one for "Mail"
4. Use this password in the app instead of your real password


## 🖥 Application screens

| Screen | Description |
|--------|-------------|
| Login | Enter email credentials to connect your account |
| Dashboard | Overview of inbox, sent, and scheduled emails |
| Compose | Write and send or schedule an email |
| Inbox | Read and browse received emails |

---

## ⚙️ How it works
```
User Login (email + app password)
        │
        ▼
Dashboard (multi-account overview)
        │
        ├──▶ Compose window
        │         │
        │         ├──▶ Send immediately (SMTP)
        │         └──▶ Schedule sending (SchedulerService)
        │
        └──▶ Inbox view (IMAP fetch + display)
```

---

## 🛠 Tech stack

| Layer | Technology |
|-------|-----------|
| Language | Java 8+ |
| GUI | Java Swing |
| Email sending | JavaMail SMTP |
| Email receiving | JavaMail IMAP / POP3 |
| Scheduling | Java ScheduledExecutorService |
| Dependencies | javax.mail-1.6.2 |

---

## 📄 License

This project is licensed under the MIT License.

---

## 👩‍💻 Author

**Hajar Benbassou**  
Final-year AI & Data Science Engineering student at ENSAM Rabat

[![LinkedIn](https://img.shields.io/badge/LinkedIn-0A66C2?style=flat&logo=linkedin&logoColor=white)](https://linkedin.com/in/hajar-benbassou)
[![GitHub](https://img.shields.io/badge/GitHub-181717?style=flat&logo=github&logoColor=white)](https://github.com/hajar-125)
[![Email](https://img.shields.io/badge/Email-EA4335?style=flat&logo=gmail&logoColor=white)](mailto:benbassou.hajar@gmail.com)
