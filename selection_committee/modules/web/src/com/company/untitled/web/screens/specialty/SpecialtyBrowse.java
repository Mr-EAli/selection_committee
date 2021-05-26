package com.company.untitled.web.screens.specialty;

import com.haulmont.cuba.gui.screen.*;
import com.company.untitled.college.Specialty;

@UiController("untitled_Specialty.browse")
@UiDescriptor("specialty-browse.xml")
@LookupComponent("specialtiesTable")
@LoadDataBeforeShow
public class SpecialtyBrowse extends StandardLookup<Specialty> {
}