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
public class VistaRegistrarseActivityTest {


    @Rule
    public ActivityTestRule<VistaRegistrarseActivity> activityRule = new ActivityTestRule<>(VistaRegistrarseActivity.class);
    @Test
    public void VistaRegistraseActivityCase01() {

        onView(withId(R.id.nombreF)).check(matches(isDisplayed()));
        onView(withId(R.id.apellidosF)).check(matches(isDisplayed()));
        onView(withId(R.id.direccionF)).check(matches(isDisplayed()));
        onView(withId(R.id.celularF)).check(matches(isDisplayed()));
        onView(withId(R.id.correoF)).check(matches(isDisplayed()));
        onView(withId(R.id.contrasenia1F)).check(matches(isDisplayed()));
        onView(withId(R.id.contrasenia2F)).check(matches(isDisplayed()));

       // onView(withId(R.id.rbAccept)).check(matches(isDisplayed()));

    }
    @Test
    public void VistaRegistraseActivityCase01ok() {
        String nombre ="Juan";
        onView(withId(R.id.nombreF)).check(matches(isDisplayed()));
        onView(withId(R.id.apellidosF)).check(matches(isDisplayed()));
        onView(withId(R.id.direccionF)).check(matches(isDisplayed()));
        onView(withId(R.id.celularF)).check(matches(isDisplayed()));
        onView(withId(R.id.correoF)).check(matches(isDisplayed()));
        onView(withId(R.id.contrasenia1F)).check(matches(isDisplayed()));
        onView(withId(R.id.contrasenia2F)).check(matches(isDisplayed()));
       // onView(withId(R.id.rbAccept)).perform(click());
      //  onView(withId(R.id.registrar)).perform(click());



    }
    @Test
    public void VistaRegistraseActivityCase02ok() {
        String nombre ="Juan";
        String apellidos="Perez Chilon";
        onView(withId(R.id.nombreF)).check(matches(isDisplayed()));
        onView(withId(R.id.apellidosF)).check(matches(isDisplayed()));
        onView(withId(R.id.direccionF)).check(matches(isDisplayed()));
        onView(withId(R.id.celularF)).check(matches(isDisplayed()));
        onView(withId(R.id.correoF)).check(matches(isDisplayed()));
        onView(withId(R.id.contrasenia1F)).check(matches(isDisplayed()));
        onView(withId(R.id.contrasenia2F)).check(matches(isDisplayed()));
      //  onView(withId(R.id.rbAccept)).perform(click());
        //onView(withId(R.id.registrar)).check(matches(isDisplayed()));



    }
      @Test
    public void VistaRegistraseActivityCase03ok() {
          String nombre ="Juan";
          String apellidos="Perez Chilon";
          String direccion="Jr. comercio 440";
        onView(withId(R.id.nombreF)).check(matches(isDisplayed()));
        onView(withId(R.id.apellidosF)).check(matches(isDisplayed()));
        onView(withId(R.id.direccionF)).check(matches(isDisplayed()));
        onView(withId(R.id.celularF)).check(matches(isDisplayed()));
        onView(withId(R.id.correoF)).check(matches(isDisplayed()));
        onView(withId(R.id.contrasenia1F)).check(matches(isDisplayed()));
        onView(withId(R.id.contrasenia2F)).check(matches(isDisplayed()));
        //  onView(withId(R.id.rbAccept)).perform(click());
         // onView(withId(R.id.registrar)).check(matches(isDisplayed()));

    }
    @Test
    public void VistaRegistraseActivityCase04ok() {
        String nombre ="Juan";
        String apellidos="Perez Chilon";
        String direccion="Jr. comercio 440";
        String  celular= "998789656";
        onView(withId(R.id.nombreF)).check(matches(isDisplayed()));
        onView(withId(R.id.apellidosF)).check(matches(isDisplayed()));
        onView(withId(R.id.direccionF)).check(matches(isDisplayed()));
        onView(withId(R.id.celularF)).check(matches(isDisplayed()));
        onView(withId(R.id.correoF)).check(matches(isDisplayed()));
        onView(withId(R.id.contrasenia1F)).check(matches(isDisplayed()));
        onView(withId(R.id.contrasenia2F)).check(matches(isDisplayed()));
      //  onView(withId(R.id.rbAccept)).perform(click());
       // onView(withId(R.id.registrar)).check(matches(isDisplayed()));
    }
    @Test
    public void VistaRegistraseActivityCase05ok() {

        String nombre ="Juan";
        String apellidos="Perez Chilon";
        String direccion="Jr. comercio 440";
        String  celular= "998789656";
        String  correo= "juan@gmail.com";
        onView(withId(R.id.nombreF)).check(matches(isDisplayed()));
        onView(withId(R.id.apellidosF)).check(matches(isDisplayed()));
        onView(withId(R.id.direccionF)).check(matches(isDisplayed()));
        onView(withId(R.id.celularF)).check(matches(isDisplayed()));
        onView(withId(R.id.correoF)).check(matches(isDisplayed()));
        onView(withId(R.id.contrasenia1F)).check(matches(isDisplayed()));
        onView(withId(R.id.contrasenia2F)).check(matches(isDisplayed()));
       // onView(withId(R.id.rbAccept)).perform(click());
       // onView(withId(R.id.registrar)).check(matches(isDisplayed()));
    }

    @Test
    public void VistaRegistraseActivityCase06ok() {
        String nombre ="Juan";
        String apellidos="Perez Chilon";
        String direccion="Jr. comercio 440";
        String  celular= "998789656";
        String  correo= "juan@gmail.com";
        String contrasenia1 = "123juan";
        String contrasenia2 = "123juan";
        onView(withId(R.id.nombreF)).check(matches(isDisplayed()));
        onView(withId(R.id.apellidosF)).check(matches(isDisplayed()));
        onView(withId(R.id.direccionF)).check(matches(isDisplayed()));
        onView(withId(R.id.celularF)).check(matches(isDisplayed()));
        onView(withId(R.id.correoF)).check(matches(isDisplayed()));
        onView(withId(R.id.contrasenia1F)).check(matches(isDisplayed()));
        onView(withId(R.id.contrasenia2F)).check(matches(isDisplayed()));
        onView(withId(R.id.registrar)).check(matches(isDisplayed()));

    }
    @Test
    public void VistaRegistraseActivityCase01Fail() {
        String nombre =" ";
        String apellidos=" ";
        String direccion=" ";
        String  celular= " ";
        String  correo= " ";
        String contrasenia1 = " ";
        String contrasenia2 = " ";
        onView(withId(R.id.nombreF)).check(matches(isDisplayed()));
        onView(withId(R.id.apellidosF)).check(matches(isDisplayed()));
        onView(withId(R.id.direccionF)).check(matches(isDisplayed()));
        onView(withId(R.id.celularF)).check(matches(isDisplayed()));
        onView(withId(R.id.correoF)).check(matches(isDisplayed()));
        onView(withId(R.id.contrasenia1F)).check(matches(isDisplayed()));
        onView(withId(R.id.contrasenia2F)).check(matches(isDisplayed()));
        onView(withId(R.id.registrar)).check(matches(isDisplayed()));

    }
}
