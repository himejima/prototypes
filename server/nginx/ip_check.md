ip制限するとき 上から下に適用される

```
location /hogehoge/ {
  allow xxx.xxxx.xxx.xxx;  
  deny all;
}
```
