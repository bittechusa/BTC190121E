package com.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"/Users/bittechconsulting/Desktop/BTC190121E/BDD_BTC190121E/FeaturesFile"},tags= {"@smoke"},glue= {"com.login"},format= {"pretty","json:Folder_Name/cucumber.json"})
public class Runner {

}
