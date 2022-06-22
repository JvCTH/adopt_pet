package com.example.adopt_pet.autenticacion;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import com.example.adopt_pet.R;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class VistaIniciarSesionTest {

    @Rule
    public ActivityTestRule<VistaIniciarSesionActivity> activityRule = new ActivityTestRule<>(VistaIniciarSesionActivity.class);
    @Test
    public void VistaIniciarSesionActivityCase01() {

        onView(withId(R.id.email)).check(matches(isDisplayed()));
        onView(withId(R.id.password)).check(matches(isDisplayed()));
        onView(withId(R.id.login)).perform(click());
        onView(withId(R.id.regis)).perform(click());

    }
    @Test
    public void VistaIniciarSesionActivityCase01ok() {
        String emailS= "jovithvico@gmail.com";

        onView(withId(R.id.email)).check(matches(isDisplayed()));
        onView(withId(R.id.password)).check(matches(isDisplayed()));
        onView(withId(R.id.login)).perform(click());

    }
    public void VistaIniciarSesionActivityCase02ok() {
        String emailS= "jovithvico@gmail.com";
        String passwordS = "jose123";
        onView(withId(R.id.email)).check(matches(isDisplayed()));
        onView(withId(R.id.password)).check(matches(isDisplayed()));
        onView(withId(R.id.login)).perform(click());

    }
    @Test
    public void VistaIniciarSesionActivityCase01Fail() {
        String emailS = "jovith@gmail.com";
        onView(withId(R.id.email)).check(matches(isDisplayed()));
        onView(withId(R.id.password)).check(matches(isDisplayed()));
        onView(withId(R.id.login)).perform(click());


    }
    @Test
    public void VistaIniciarSesionActivity02Fail() {
        String emailS= "jovith@gmail.com";
        String passwordS = "12345678";
        onView(withId(R.id.email)).check(matches(isDisplayed()));
        onView(withId(R.id.password)).check(matches(isDisplayed()));
        onView(withId(R.id.login)).perform(click());



    }
}
