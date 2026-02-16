## 🍔 Full Mac Local Deployment Guide

> Applicable to macOS (Apple Silicon / Intel)
> Stack: Spring Boot + MySQL + Redis + Nginx

---

### 📌 1. Environment Preparation

#### 1️⃣ Install Homebrew

If not installed:

```bash
/bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"
```

It is recommended to switch to Tsinghua mirrors (refer to official Tsinghua source tutorial).

---

#### 2️⃣ Install Core Services

#### Install Nginx

```bash
brew install nginx
```

#### Install Redis

```bash
brew install redis
```

#### Install MySQL

```bash
brew install mysql
```

---

#### 3️⃣ Start Services

```bash
brew services start mysql
brew services start redis
brew services start nginx
```

Check service status:

```bash
brew services list
```

It should show:

```
mysql  started
redis  started
nginx  started
```

---

### 📌 2. Confirm Nginx Configuration File Location (Important)

Check nginx path:

```bash
which nginx
```

If it shows:

```
/opt/homebrew/bin/nginx
```

Check the configuration file:

```bash
nginx -t
```

It should show something like:

```
/opt/homebrew/etc/nginx/nginx.conf
```

⚠️ This is the actual active configuration file path.

---

### 📌 3. Configure Front-end Static Resources

Assume your front-end directory is:

```
/Users/your-username/Desktop/Sky-take-out/Front-end/nginx-1.20.2/html/sky
```

---

#### 1️⃣ Edit nginx.conf

```bash
nano /opt/homebrew/etc/nginx/nginx.conf
```

Find:

```nginx
server {
    listen 80;
    server_name localhost;
```

Modify `root` to your front-end absolute path:

```nginx
location / {
    root   /Users/your-username/Desktop/Sky-take-out/Front-end/nginx-1.20.2/html/sky;
    index  index.html index.htm;
}
```

---

#### 2️⃣ Save and Exit

In nano:

```
Ctrl + O
Enter
Ctrl + X
```

---

#### 3️⃣ Reload Configuration

```bash
brew services restart nginx
```

or:

```bash
nginx -s reload
```

---

#### 4️⃣ Set File Permissions

```bash
sudo chmod -R 755 /Users/your-username/Desktop/Sky-take-out/Front-end
```

---

#### 5️⃣ Access Front-end

Open browser:

```
http://localhost
```

Default port is 80.

---

### 📌 4. Start Back-end Service

Go to back-end project directory:

```bash
mvn clean install
mvn spring-boot:run
```

Or directly run:

```
SkyServerApplication
```

⚠️ Remember to modify:

```
application-dev.yml
```

Including:

* Database username/password
* Redis address
* OSS configuration

---

### 📌 5. Redis Operations

Start:

```bash
brew services start redis
```

Stop:

```bash
brew services stop redis
```

Default port:

```
6379
```

---

### 📌 6. MySQL Startup

```bash
brew services start mysql
```

Default port:

```
3306
```

Import database SQL scripts before starting back-end service.

---

### 📌 7. WeChat Mini Program Login No Popup Issue

If clicking login does not show the authorization popup:

1. Open WeChat Developer Tools
2. Click “Details”
3. Local settings
4. Set the Base Library version to:

```
2.25.4
```

Then recompile.

---

### 📌 8. Common Troubleshooting

#### 1️⃣ Check if nginx is running

```bash
ps aux | grep nginx
```

---

#### 2️⃣ Test nginx configuration

```bash
nginx -t
```

---

#### 3️⃣ Restart nginx

```bash
brew services restart nginx
```

---

#### 4️⃣ If port 80 cannot be accessed

It may be occupied:

```bash
lsof -i :80
```

---

### 📌 9. Recommended Start-up Order

Recommended order:

```
1️⃣ MySQL
2️⃣ Redis
3️⃣ Back-end service
4️⃣ Nginx
5️⃣ Browser access
```

---

### 📌 10. Final Access URL

```
http://localhost
```

---

### 🎯 Deployment Complete

Once you can successfully:

* Login to admin panel
* Upload images
* Create orders
* View products

It indicates deployment is successful.

---

### 📌 Optional: Compile Nginx from Source (Not Recommended)

If you really need to compile from source (usually unnecessary):

```bash
tar -zxvf nginx-1.24.0.tar.gz
cd nginx-1.24.0
./configure
make
sudo make install
```

⚠️ But using brew on Mac is simpler and more stable.

---
