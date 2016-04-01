<?php

class Robot
{
    protected $head;
    protected $body;
    protected $arm;
    protected $leg;

    public function __construct()
    {
        $this->head = 'head';
        $this->body = 'body';
        $this->arm = 'arm arm';
        $this->leg = 'leg leg leg';
    }
}


$t = new Robot();
$arr = (array)$t;
var_dump($arr);


