<?php

// $t = [
//     'a' => 999,
//     'b' => 123,
// ];
$t = [
    3 => 999,
    1 => 123,
    // "con" => [ 1 => 2, 3 => 4, 5 => 6],
    "5" => [ 1 => 2, 3 => 4, 5 => 6],
];

var_dump(json_encode($t));

$b = json_encode($t);
var_dump(json_decode($b, true));


// jsonをリスト形式で。
$t2 = [
    '東京', '大阪', '福岡', '京都'
];
var_dump(json_encode($t2));

$b2 = json_encode($t2);
var_dump(json_decode($b2, true));
