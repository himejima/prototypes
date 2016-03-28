<?php

$g = 'abc.aaaa.kkkk.bbbbb';

if (preg_match("/^abc\./", $g)) {
    echo 'match';
}
