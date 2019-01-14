import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//задача №
//4. Вычисление объемов тел (параллелепипед, куб, сфера, тетраэдр, тор, шар, эллипсоид и т.д.)
// с точностью и параметрами, указываемыми пользователем.
@WebServlet(urlPatterns = {"/volumeServlet"})
public class VolumeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        RequestDispatcher dispatcher //
                = this.getServletContext().getRequestDispatcher("/result.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        double dimm = Double.parseDouble(req.getParameter("cubeDimension"));
        double rad = Double.parseDouble(req.getParameter("sphereRad"));
        double sideA = Double.parseDouble(req.getParameter("cuboidA"));
        double sideB = Double.parseDouble(req.getParameter("cuboidB"));
        double sideC = Double.parseDouble(req.getParameter("cuboidC"));
        double areaOfBase = Double.parseDouble(req.getParameter("areaBase"));
        double heightToBase = Double.parseDouble(req.getParameter("height"));
        int accuracy = Integer.parseInt(req.getParameter("accuracy"));


        Cube cube = new Cube();
        Sphere sphere = new Sphere();
        Cuboid cuboid= new Cuboid();
        Tetrahedron tetrahedron =new Tetrahedron();

        cube.setDimension(dimm);
        sphere.setR(rad);
        cuboid.setSideA(sideA);
        cuboid.setSideB(sideB);
        cuboid.setSideC(sideC);
        tetrahedron.setAreaOfBase(areaOfBase);
        tetrahedron.setHeightToBase(heightToBase);

        double sphereVolume = sphere.calcVolume();
        double cubeVolume = cube.calcVolume();
        double cuboidVolume = cuboid.calcVolume();
        double tetrahedronVolume = tetrahedron.calcVolume();
        req.setAttribute("cube", cubeVolume);
        req.setAttribute("sphere", sphereVolume);
        req.setAttribute("cuboid", cuboidVolume);
        req.setAttribute("tetr", tetrahedronVolume);
        req.setAttribute("accuracy", accuracy);

        RequestDispatcher dispatcher //
                = this.getServletContext().getRequestDispatcher("/result.jsp");
        dispatcher.forward(req, resp);

    }
}
