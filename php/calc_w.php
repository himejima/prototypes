<?php
/**
 * Usage: $ php calc_w.php '2016/03/07' 
 *
 */

// 日付から曜日を取得したい

$week = [
    '日', '月', '火', '水', '木', '金', '土',
];

$target_date = $argv[1];

$w = (new DateTime($target_date,  new DateTimeZone('Asia/Tokyo')))->format('w');

echo $week[$w];
