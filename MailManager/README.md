# Mail Manager Application

A Java-based email management application with GUI support.

## Project Structure
```
MailManager/
├── src/                    # Java source files
├── lib/                    # External libraries
├── bin/                    # Compiled classes (generated)
├── setup.sh               # Downloads required libraries
├── compile.sh             # Compiles the project
└── run.sh                 # Runs the application
```

## Setup Instructions

1. **Initial Setup** - Download required JavaMail libraries:
   ```bash
   bash setup.sh
   ```

2. **Compile** - Compile all Java files:
   ```bash
   bash compile.sh
   ```

3. **Run** - Launch the application:
   ```bash
   bash run.sh
   ```

## Features
- **LoginFrame**: Authentication interface for email credentials
- **DashboardFrame**: Main application dashboard
- **ComposeFrame**: Email composition interface
- **EmailSender**: Send emails via SMTP (Gmail)
- **EmailReceiver**: Read emails via IMAP (Gmail)
- **SchedulerService**: Schedule delayed email sending

## Notes
- The application uses Gmail SMTP/IMAP for email operations
- Requires JavaMail libraries (automatically downloaded by setup.sh)
- GUI built with Java Swing
