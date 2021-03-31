package com.university.professorservice.Services;
import com.university.professorservice.Client.DepartmentClient;
import com.university.department.DepartmentServiceGrpc;
import com.university.professor.Profile;
import com.google.protobuf.Empty;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

@Slf4j
@GRpcService
public class ProfessorServiceImpl extends com.university.professor.ProfessorServiceGrpc.ProfessorServiceImplBase {
    @Autowired
    DepartmentClient departmentClient;
    private com.university.department.DepartmentServiceGrpc.DepartmentServiceBlockingStub departmentServiceBlockingStub;
    @PostConstruct
    public void postConstruct() {
        departmentServiceBlockingStub = DepartmentServiceGrpc.newBlockingStub(departmentClient.departmentChannel());
    }
    @Override
    public void getProfile(Empty request, StreamObserver<Profile> responseObserver) {
        log.info("Got request to fetch professor profile.");
        log.debug("Fetching department of professor from universityService");
        com.university.department.Profile deptProfile =  com.university.department.Profile.newBuilder().setId("CS1001").build();
        log.debug("Received department of professor from universityService");
        com.university.department.Department department = departmentServiceBlockingStub.getDepartment(deptProfile);
        Profile profile = Profile.newBuilder().setName("Ravindra").setCity("Jaipur").setCountry("India").setId("CS1001").setDepartment(department.getName()).build();
        log.info("Sending professor profile.");
        responseObserver.onNext(profile);
        responseObserver.onCompleted();
    }
}
