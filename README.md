# java-k8s-app

## Overview

This is a Spring Boot-based Java application that is containerized using Docker and deployed to Kubernetes. It demonstrates a complete DevOps workflow, including source code management, containerization, and CI/CD automation using GitHub Actions.

---

## Project Structure

| Path                    | Description                                      |
|-------------------------|--------------------------------------------------|
| `src/main/java/...`     | Java source code for the Spring Boot application |
| `pom.xml`               | Maven configuration for build and dependencies   |
| `Dockerfile`            | Instructions to build the Docker image           |
| `k8s/`                  | Kubernetes manifests for deployment              |
| `.github/workflows/`    | GitHub Actions workflow for CI/CD                |

---

## Technologies Used

- Java 17
- Spring Boot 3.1.2
- Maven
- Docker
- Kubernetes
- GitHub Actions

---

## Build and Run Locally

### 1. Compile and Package
```bash
mvn clean package
```

### 2. Run Locally
```bash
java -jar target/demo-0.0.1-SNAPSHOT.jar
```

---

## Docker Setup

### 1. Build Docker Image
```bash
docker build -t java-k8s-app .
```

### 2. Run Container
```bash
docker run -p 8080:8080 java-k8s-app
```

---

## Kubernetes Deployment

### 1. Apply Manifests
```bash
kubectl apply -f k8s/
```

### 2. Verify Pods
```bash
kubectl get pods
```

### 3. Expose Service
```bash
kubectl expose deployment java-k8s-app --type=LoadBalancer --port=8080
```

---

## CI/CD Pipeline (GitHub Actions)

Located in `.github/workflows/`, the pipeline automates:

- Build the Java application using Maven on every push
- Build a Docker image from the application
- Push the Docker image to Docker Hub (if credentials are configured)
- Deploy to Kubernetes (optional, requires secrets and cluster context)

> Note: No automated testing is currently configured in the pipeline.
