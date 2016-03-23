<?php

class OreoreException extends Exception
{
    public function __construct($message, $code = 100)
    {
        parent::__construct($message, $code);
    }
}

try {
    throw new OreoreException('miss!!!');
} catch (OreoreException $ex) {
    var_dump($ex->getMessage());
}
