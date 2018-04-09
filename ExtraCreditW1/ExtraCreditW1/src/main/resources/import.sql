INSERT INTO `PROJECT` VALUES (1,'EA Course','2018-04-10 00:00:00','FairField','2018-01-07 00:00:00','READY');

INSERT INTO `BENEFICIARY` VALUES (1,'Facility',1);

INSERT INTO `RESOURCE` VALUES (1,'Java');

INSERT INTO `VOLUNTEER` VALUES (1,'Danh Dat Doan');

INSERT INTO `VOLUNTEER_RESOURCE` VALUES (1,1);

INSERT INTO `TASK` (`ID`, `END_DATE`, `START_DATE`, `STATUS`, `PROJECT_ID`) VALUES ('1', '2018-01-08 00:00:00', '2018-01-07 00:00:00', 'READY', '1');

INSERT INTO `TASK` (`ID`, `END_DATE`, `START_DATE`, `STATUS`, `PROJECT_ID`) VALUES ('2', '2018-01-12 00:00:00', '2018-01-10 00:00:00', 'READY', '1');

INSERT INTO `TASK_RESOURCE` (`RESOURCE_ID`, `TASK_ID`, `NUM_RESOURCE`) VALUES ('1', '1', '10');

INSERT INTO `TASK_RESOURCE` (`RESOURCE_ID`, `TASK_ID`, `NUM_RESOURCE`) VALUES ('1', '2', '5');

INSERT INTO `TASK_VOLUNTEER` (`TASK_ID`, `VOLUNTEER_ID`) VALUES ('1', '1');

INSERT INTO `TASK_VOLUNTEER` (`TASK_ID`, `VOLUNTEER_ID`) VALUES ('2', '1');

