<?php
// guzzleがインストールしてある前提

require 'vendor/autoload.php';

use GuzzleHttp\Client;
$client = new GuzzleHttp\Client();
$res = $client->request('GET', 'http://blog.fkoji.com/');

echo $res->getBody();
echo $res->getStatusCode();
