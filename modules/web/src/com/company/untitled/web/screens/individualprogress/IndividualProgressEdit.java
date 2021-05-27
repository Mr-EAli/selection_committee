package com.company.untitled.web.screens.individualprogress;

import com.haulmont.cuba.gui.screen.*;
import com.company.untitled.progress.IndividualProgress;

@UiController("untitled_IndividualProgress.edit")
@UiDescriptor("individual-progress-edit.xml")
@EditedEntityContainer("individualProgressDc")
@LoadDataBeforeShow
public class IndividualProgressEdit extends StandardEditor<IndividualProgress> {
}