## build.gradle.kts

注意配置文件使用双引号

```bash
## 跳过单元测试.
gradle build -x test
```

## postgres

```sql
-- 创建用户并指定密码
create user user_kotlin with password 'kotlin';
-- 创建数据并指定所属用户
create database sb_kotlin owner user_kotlin;
-- 回收数据库的public权限
revoke all on database sb_kotlin from public;
```