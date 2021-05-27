package com.company.untitled.web.screens.specialty;

import com.haulmont.cuba.gui.screen.*;
import com.company.untitled.college.Specialty;

@UiController("untitled_Specialty.edit")
@UiDescriptor("specialty-edit.xml")
@EditedEntityContainer("specialtyDc")
@LoadDataBeforeShow
public class SpecialtyEdit extends StandardEditor<Specialty> {
}