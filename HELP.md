# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/3.5.5/maven-plugin)
* [Create an OCI image](https://docs.spring.io/spring-boot/3.5.5/maven-plugin/build-image.html)

### Maven Parent overrides

Due to Maven's design, elements are inherited from the parent POM to the project POM.
While most of the inheritance is fine, it also inherits unwanted elements like `<license>` and `<developers>` from the parent.
To prevent this, the project POM contains empty overrides for these elements.
If you manually switch to a different parent and actually want the inheritance, you need to remove those overrides.

# Spring Boot Standard Practice
There are various conventions that are recommended for developer to adhere for several reasons, 
impacting both individual productivity and team collaboration:
1. Enhanced Readability and Maintainability
   - <details>
     <summary>Consistency</summary>
     <small style="color: grey;">Provide a consistent structure and style for code, making it easier for developers (including your future self) to understand and navigate the codebase.</small>
     </details>
     
   - <details>
     <summary>Reduced Cognitive Load</summary>
     <small style="color: grey;">When code adheres to established patterns, developers spend less time deciphering unfamiliar structures and can focus on the logic and problem-solving.</small>
     </details>
     
   - <details>
     <summary>Simplified Debugging</summary>
     <small style="color: grey;">Consistent naming and organization make it easier to locate and identify issues, leading to faster debugging and troubleshooting.</small>
     </details>
    
2. Improved Collaboration and Teamwork
   - <details>
     <summary>Seamless Onboarding</summary>
     <small style="color: grey;">New team members can quickly understand the codebase and contribute effectively when consistent conventions are in place.</small>
     </details>
     
   - <details>
     <summary>Reduced Conflicts</summary>
     <small style="color: grey;">Standardized naming and formatting minimize misunderstandings and merge conflicts, especially in large projects with multiple contributors.</small>
     </details>
     
   - <details>
     <summary>Efficient Code Reviews</summary>
     <small style="color: grey;">Conventions streamline the code review process, allowing reviewers to focus on functionality and logic rather than stylistic inconsistencies.</small>
     </details>
     
3. Increased Efficiency and Scalability
   - <details>
     <summary>Faster Development</summary>
     <small style="color: grey;">Conventions reduce the need for individual stylistic decisions, allowing developers to write code more efficiently.</small>
     </details>
     
   - <details>
     <summary>Easier Refactoring</summary>
     <small style="color: grey;">Consistent code is simpler to refactor and modify, facilitating the evolution and improvement of the codebase over time.</small>
     </details>
     
   - <details>
     <summary>Long-term Project Health</summary>
     <small style="color: grey;">Adhering to conventions contributes to a well-structured and maintainable codebase, which is essential for the long-term success and scalability of web applications.</small>
     </details>
     
4. User Experience and Accessibility
   - <details>
     <summary>Familiarity</summary>
     <small style="color: grey;">Following established web conventions for user interface elements and navigation creates a familiar and intuitive experience for users, reducing confusion and improving usability.</small>
     </details>
     
   - <details>
     <summary>Accessibility</summary>
     <small style="color: grey;">Conventions often align with accessibility best practices, ensuring that websites are usable by individuals with diverse needs.</small>
     </details>

### Group ID and Artifact ID Naming Convention
<table>
  <tr>
    <th>ITEM</th>
    <th>PLACE</th>
    <th>BEST PRACTICE</th>
    <th>EXAMPLE</th>
  </tr>
  <tr>
    <td rowspan="2">Group ID</td>
    <td>pom.xml</td>
    <td rowspan="2">Lowercase, no underscores/hyphens</td>
    <td rowspan="2">com.example.orderservice, dev.name.appservice</td>
  </tr>
<tr>
    <td>Package name</td>
</tr>
<tr>
    <td rowspan="3">Artifact ID</td>
    <td>pom.xml</td>
    <td rowspan="2">Lowercase, hyphen-separated</td>
    <td rowspan="2">order-service</td>
</tr>
<tr>
    <td>application.properties</td>
</tr>
<tr>
    <td>Package name</td>
    <td>Lowercase, no underscores/hyphens</td>
    <td>orderservice</td>
</tr>
</table>