package com.university.departmentservice.Service;

import com.university.department.DepartmentServiceGrpc;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import org.lognet.springboot.grpc.GRpcService;

@Slf4j
@GRpcService
public class DepartmentServiceImpl extends DepartmentServiceGrpc.DepartmentServiceImplBase {

    @Override
    public void getDepartment(com.university.department.Profile profile, StreamObserver<com.university.department.Department> responseObserver) {
        log.info("Got request to fetch department of professor with id- {}.",profile.getId());
        log.debug("Fetching department of professor");
        com.university.department.Department department = com.university.department.Department.newBuilder().setName("CS").build();
        log.debug("Professor's department fetched.");
        log.info("Sending department details.");
        responseObserver.onNext(department);
        responseObserver.onCompleted();
    }
}
