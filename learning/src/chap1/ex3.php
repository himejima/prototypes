<?php
function main($input1, $input2) {
    $t = check($input1, $input2);

    if ($t) {
        echo "並び替え" . "\n";
    } else {
        echo "並び替えじゃない" . "\n";
    }
}

function check($str1, $str2) {
    // TODO: 文字列の長さを比較
    for ($i = 0; $i < mb_strlen($str1); $i++) {
        # echo $str1[$i] . "\n";
        # echo $str2[mb_strlen($str1) - ($i + 1)] . "\n";

        if ($str1[$i] !== $str2[mb_strlen($str1) - ($i + 1)]) {
            return false;
        }
    }
    return true;
}


$input1 = $argv[1];
$input2 = $argv[2];

echo "input1: " . $input1 . "\n";
echo "input2: " . $input2 . "\n";
main($input1, $input2);
