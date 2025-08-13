# Base dev container (Ubuntu 24.04, non-root user `vscode` preconfigured)
FROM mcr.microsoft.com/devcontainers/base:ubuntu-24.04

# Install Java 21 (OpenJDK), JavaFX, and common build tools
RUN apt-get update && DEBIAN_FRONTEND=noninteractive apt-get install -y \
    openjdk-21-jdk \
    openjfx \
    maven \
    gradle \
    # GUI libs often needed by AWT/Swing/JavaFX
    libgtk-3-0 \
    libnss3 \
    libasound2 \
 && apt-get clean && rm -rf /var/lib/apt/lists/*

# Set JAVA_HOME for convenience
ENV JAVA_HOME=/usr/lib/jvm/java-21-openjdk-amd64
ENV PATH="$JAVA_HOME/bin:${PATH}"

# Workdir for your project
WORKDIR /workspaces/${LOCAL_WORKSPACE_FOLDER_BASENAME:-app}
