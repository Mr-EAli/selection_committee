package com.company.untitled.web.screens.department;

import com.haulmont.cuba.gui.screen.*;
import com.company.untitled.college.Department;

@UiController("untitled_Department.browse")
@UiDescriptor("department-browse.xml")
@LookupComponent("departmentsTable")
@LoadDataBeforeShow
public class DepartmentBrowse extends StandardLookup<Department> {
}