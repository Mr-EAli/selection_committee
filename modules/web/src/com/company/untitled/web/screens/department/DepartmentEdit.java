package com.company.untitled.web.screens.department;

import com.haulmont.cuba.gui.screen.*;
import com.company.untitled.college.Department;

@UiController("untitled_Department.edit")
@UiDescriptor("department-edit.xml")
@EditedEntityContainer("departmentDc")
@LoadDataBeforeShow
public class DepartmentEdit extends StandardEditor<Department> {
}