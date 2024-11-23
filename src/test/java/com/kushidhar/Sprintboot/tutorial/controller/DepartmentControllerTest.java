package com.kushidhar.Sprintboot.tutorial.controller;

//@Service
//@WebMvcTest(DepartmentController.class)
class DepartmentControllerTest {

//    @Autowired
//    private MockMvc mockMvc;
//
//
//    private DepartmentService departmentService;
//    private Department department;
//
//
//    @BeforeEach
//    void setUp() {
//        department = Department.builder()
//                .departmentAddress("Pocharam")
//                .departmentCode("IT-06")
//                .departmentName("IT")
//                .departmentId(1L)
//                .build();
//    }
//
//    @Test
//    void saveDepartment() throws Exception {
//        Department inputDepartment = Department.builder()
//                .departmentAddress("Pocharam")
//                .departmentCode("IT-06")
//                .departmentName("IT")
//                .build();
//        Mockito.when(departmentService.saveDepartment(inputDepartment))
//                .thenReturn(department);
//
//        mockMvc.perform(post("/departments")
//                .contentType(MediaType.APPLICATION_JSON)
//                .content("{\n" +
//                        "    \"departmentName\":\"IT\",\n" +
//                        "    \"departmentAddress\":\"Pocharam\",\n" +
//                        "    \"departmentCode\":\"IT-06\"\n" +
//                        "}"))
//                .andExpect(status().isOk());
//    }

//    @Test
//    void fetchDepartmentById() throws DepartmentNotFoundException {
//        Mockito.when(departmentService.fetchDepartmentById(1L))
//                .thenReturn(department);
//        mockMvc.perform(get("/departments/1")
//                .contentType(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$.departmentName").value(department.getDepartmentName()));
//    }
}