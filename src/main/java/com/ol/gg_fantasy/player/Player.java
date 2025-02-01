package com.ol.gg_fantasy.player;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//Represent data model in app or map directly to ol_stats table
@Entity
@Table(name="player_stats")
public class Player {
    @Id
    @Column(name = "name", unique = true)
    private String name;
    private Integer game_number;
    private Integer start_sr;
    private Integer end_sr;
    private Integer sr_change;
    private Integer team_sr_avg;
    private Integer enemy_sr_avg;
    private Integer team_stack;
    private Integer enemy_stack;
    private String role;
    private String result;
    private Integer streak;
    private Boolean leaver;
    private String map;
    private Double match_time;
    private Integer eliminations;
    private Double eliminations_career;
    private String eliminations_medal;
    private Integer objective_kills;
    private Double objective_kills_career;
    private String objective_kills_medal;
    private Double objective_time;
    private Double objective_time_career;
    private String objective_time_medal;
    private Integer damage;
    private Double damage_career;
    private String damage_medal;
    private Integer heal;
    private Double heal_career;
    private String heal_medal;
    private Integer death;
    private Double death_career;
    private String team;

    public Player() {
    }

    public Player(String name, Integer game_number, Integer start_sr, Integer end_sr, Integer sr_change, Integer team_sr_avg, Integer enemy_sr_avg, Integer team_stack, Integer enemy_stack, String role, String result, Integer streak, Boolean leaver, String map, Double match_time, Integer eliminations, Double eliminations_career, String eliminations_medal, Integer objective_kills, Double objective_kills_career, String objective_kills_medal, Double objective_time, Double objective_time_career, String objective_time_medal, Integer damage, Double damage_career, String damage_medal, Integer heal, Double heal_career, String heal_medal, Integer death, Double death_career, String team) {
        this.name = name;
        this.game_number = game_number;
        this.start_sr = start_sr;
        this.end_sr = end_sr;
        this.sr_change = sr_change;
        this.team_sr_avg = team_sr_avg;
        this.enemy_sr_avg = enemy_sr_avg;
        this.team_stack = team_stack;
        this.enemy_stack = enemy_stack;
        this.role = role;
        this.result = result;
        this.streak = streak;
        this.leaver = leaver;
        this.map = map;
        this.match_time = match_time;
        this.eliminations = eliminations;
        this.eliminations_career = eliminations_career;
        this.eliminations_medal = eliminations_medal;
        this.objective_kills = objective_kills;
        this.objective_kills_career = objective_kills_career;
        this.objective_kills_medal = objective_kills_medal;
        this.objective_time = objective_time;
        this.objective_time_career = objective_time_career;
        this.objective_time_medal = objective_time_medal;
        this.damage = damage;
        this.damage_career = damage_career;
        this.damage_medal = damage_medal;
        this.heal = heal;
        this.heal_career = heal_career;
        this.heal_medal = heal_medal;
        this.death = death;
        this.death_career = death_career;
        this.team = team;
    }

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGame_number() {
        return game_number;
    }

    public void setGame_number(Integer game_number) {
        this.game_number = game_number;
    }

    public Integer getStart_sr() {
        return start_sr;
    }

    public void setStart_sr(Integer start_sr) {
        this.start_sr = start_sr;
    }

    public Integer getEnd_sr() {
        return end_sr;
    }

    public void setEnd_sr(Integer end_sr) {
        this.end_sr = end_sr;
    }

    public Integer getSr_change() {
        return sr_change;
    }

    public void setSr_change(Integer sr_change) {
        this.sr_change = sr_change;
    }

    public Integer getTeam_sr_avg() {
        return team_sr_avg;
    }

    public void setTeam_sr_avg(Integer team_sr_avg) {
        this.team_sr_avg = team_sr_avg;
    }

    public Integer getEnemy_sr_avg() {
        return enemy_sr_avg;
    }

    public void setEnemy_sr_avg(Integer enemy_sr_avg) {
        this.enemy_sr_avg = enemy_sr_avg;
    }

    public Integer getTeam_stack() {
        return team_stack;
    }

    public void setTeam_stack(Integer team_stack) {
        this.team_stack = team_stack;
    }

    public Integer getEnemy_stack() {
        return enemy_stack;
    }

    public void setEnemy_stack(Integer enemy_stack) {
        this.enemy_stack = enemy_stack;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Integer getStreak() {
        return streak;
    }

    public void setStreak(Integer streak) {
        this.streak = streak;
    }

    public Boolean getLeaver() {
        return leaver;
    }

    public void setLeaver(Boolean leaver) {
        this.leaver = leaver;
    }

    public String getMap() {
        return map;
    }

    public void setMap(String map) {
        this.map = map;
    }

    public Double getMatch_time() {
        return match_time;
    }

    public void setMatch_time(Double match_time) {
        this.match_time = match_time;
    }

    public Integer getEliminations() {
        return eliminations;
    }

    public void setEliminations(Integer eliminations) {
        this.eliminations = eliminations;
    }

    public Double getEliminations_career() {
        return eliminations_career;
    }

    public void setEliminations_career(Double eliminations_career) {
        this.eliminations_career = eliminations_career;
    }

    public String getEliminations_medal() {
        return eliminations_medal;
    }

    public void setEliminations_medal(String eliminations_medal) {
        this.eliminations_medal = eliminations_medal;
    }

    public Integer getObjective_kills() {
        return objective_kills;
    }

    public void setObjective_kills(Integer objective_kills) {
        this.objective_kills = objective_kills;
    }

    public Double getObjective_kills_career() {
        return objective_kills_career;
    }

    public void setObjective_kills_career(Double objective_kills_career) {
        this.objective_kills_career = objective_kills_career;
    }

    public String getObjective_kills_medal() {
        return objective_kills_medal;
    }

    public void setObjective_kills_medal(String objective_kills_medal) {
        this.objective_kills_medal = objective_kills_medal;
    }

    public Double getObjective_time() {
        return objective_time;
    }

    public void setObjective_time(Double objective_time) {
        this.objective_time = objective_time;
    }

    public Double getObjective_time_career() {
        return objective_time_career;
    }

    public void setObjective_time_career(Double objective_time_career) {
        this.objective_time_career = objective_time_career;
    }

    public String getObjective_time_medal() {
        return objective_time_medal;
    }

    public void setObjective_time_medal(String objective_time_medal) {
        this.objective_time_medal = objective_time_medal;
    }

    public Integer getDamage() {
        return damage;
    }

    public void setDamage(Integer damage) {
        this.damage = damage;
    }

    public Double getDamage_career() {
        return damage_career;
    }

    public void setDamage_career(Double damage_career) {
        this.damage_career = damage_career;
    }

    public String getDamage_medal() {
        return damage_medal;
    }

    public void setDamage_medal(String damage_medal) {
        this.damage_medal = damage_medal;
    }

    public Integer getHeal() {
        return heal;
    }

    public void setHeal(Integer heal) {
        this.heal = heal;
    }

    public Double getHeal_career() {
        return heal_career;
    }

    public void setHeal_career(Double heal_career) {
        this.heal_career = heal_career;
    }

    public String getHeal_medal() {
        return heal_medal;
    }

    public void setHeal_medal(String heal_medal) {
        this.heal_medal = heal_medal;
    }

    public Integer getDeath() {
        return death;
    }

    public void setDeath(Integer death) {
        this.death = death;
    }

    public Double getDeath_career() {
        return death_career;
    }

    public void setDeath_career(Double death_career) {
        this.death_career = death_career;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
