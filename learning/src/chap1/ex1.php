<?php

// ある文字列が重複があるかどうかを判定 英数字のみ

$input = $argv[1];

# echo $input[0];

$arr = [];
$flag = false;

for ($i = 0; $i < mb_strlen($input); $i++) {
    if (in_array($input[$i], $arr)) {
        $flag = true;
        break;
    }

    $arr[] = $input[$i];
}

if ($flag) {
    echo "重複があります" . "\n";
} else {
    echo "重複はありません" . "\n";
}
