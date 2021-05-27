package com.company.untitled.web.screens.worker;

import com.haulmont.cuba.gui.screen.*;
import com.company.untitled.person.Worker;

@UiController("untitled_Worker.edit")
@UiDescriptor("worker-edit.xml")
@EditedEntityContainer("workerDc")
@LoadDataBeforeShow
public class WorkerEdit extends StandardEditor<Worker> {
}