<?php

abstract class Human 
{
    public $name;       // 名前 
    public $life_power; // 体力 

    /*
     * 休む
     *
     */
    public function rest()
    {
        $this->life_power -= 100;
    }
}

class BaseballPlayer extends Human
{
    const MAX_BATTING = 20;
    const MAX_DEFENSE = 20;

    public $batting;
    public $defense;

    public function __construct($name, $life_power, $batting, $defense)
    {
        $this->name = $name;
        $this->life_power = $life_power;
        $this->batting = $batting;
        $this->defense = $defense;
    }
}

class BaseballCoach extends Human
{
    public $raise_width_for_batting;
    public $raise_width_for_defense;
    
    public function __construct(
        $name, 
        $life_power, 
        $raise_width_for_batting, 
        $raise_width_for_defense
    ) {
        $this->name = $name;
        $this->life_power = $life_power;
        $this->raise_width_for_batting = $raise_width_for_batting;
        $this->raise_width_for_defense = $raise_width_for_defense;
    }

    public function teach(BaseballPlayer $player, $type)
    {
        switch ($type) {
            case 'batting': 
                $player->batting += $this->raise_width_for_batting;
                break;
            case 'defense': 
                $player->defense += $this->raise_width_for_defense;
                break;
        }
    }
}

class Training
{
    private $coach;
    private $before_player;
    private $current_player;
    private $type;

    public function __construct(BaseballCoach $coach, BaseballPlayer $player)
    {
        $this->coach = $coach;
        $this->before_player = $player;
        $this->current_player = clone $player;
    }
    
    public function setType($type)
    {
        $this->type = $type;
    }

    public function displayPlayer()
    {
        echo "選手名: " . $this->before_player->name . "\n";
        echo "---" . "\n";
        echo "変更前" . "\n";
        echo "打撃: " . $this->before_player->batting . "\n";
        echo "守備: " . $this->before_player->defense . "\n";
        echo "---" . "\n";
        echo "---" . "\n";
        echo "変更後" . "\n";
        echo "打撃: " . $this->current_player->batting . "\n";
        echo "守備: " . $this->current_player->defense . "\n";
    }

    /**
     * 能力アップ
     *
     */
    public function start()
    {
        $this->coach->teach($this->current_player, $this->type);
    }
}

$player = new BaseballPlayer('player1', 1000, 15, 10);
$coach = new BaseballCoach('coach1', 1000, 1, 2);

$t = new Training($coach, $player);
$t->setType('defense');
$t->start();

$t->displayPlayer();

/*
 * 変更前
 * ---
 * 打撃: xxx
 * 守備: xxx
 *
 *
 * 変更後
 * ---
 * 打撃: xxx
 * 守備: xxx
 */
