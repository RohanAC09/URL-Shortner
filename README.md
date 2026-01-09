# URL-Shortner

## 🚀 Running the Microservice

Follow the steps below to run this microservice locally.

### 1. Clone the Repository
```bash
git clone https://github.com/RohanAC09/URL-Shortner.git
cd url-shortner-backend/
```

### 2. Build the image with Docker
```bash
sudo docker build -t url-shortner:1.0.7 .
```

### 3. Run the Docker image
```bash
sudo docker run -d -p 8080:8080 --name url-shortner-container url-shortner:1.0.7
```

### 🛑 Stopping the Container
```bash
docker url-shortner-container
docker rm url-shortner-container
```

---
