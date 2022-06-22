package com.example.adopt_pet.autenticacion;


import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import com.example.adopt_pet.R;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class RestablecimientoActivityTest {


    @Rule
    public ActivityTestRule<RestablecimientoActivity> activityRule = new ActivityTestRule<>(RestablecimientoActivity.class);
    @Test
    public void RestablcerActivityCase01() {

        onView(withId(R.id.respEmail)).check(matches(isDisplayed()));
        onView(withId(R.id.recuperar)).perform(click());

    }
    @Test
    public void RestablcerActivityCase01ok() {
          String emailAddress = "jovithvico@gmail.com";

        onView(withId(R.id.respEmail)).check(matches(isDisplayed()));
        onView(withId(R.id.recuperar)).perform(click());

    }
    @Test
    public void RestablcerActivityCase01Fail() {
        String emailAddress= "";

        onView(withId(R.id.respEmail)).check(matches(isDisplayed()));
        onView(withId(R.id.recuperar)).perform(click());
    }

    @Test
    public void RestablcerActivityCase02Fail() {
        String emailAddress= "jovithvico@hotmail.com";

        onView(withId(R.id.respEmail)).check(matches(isDisplayed()));
        onView(withId(R.id.recuperar)).perform(click());
    }

}