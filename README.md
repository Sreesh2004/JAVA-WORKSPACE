from graphviz import Digraph
from PIL import Image

# Create a new Digraph for the Java Workspace structure
dot = Digraph(comment='Java Workspace Structure', format='png')
dot.attr(rankdir='TB', size='10')

# Define nodes with emojis to represent each module
dot.node('workspace', '📦 MyJavaWorkspace', shape='folder', style='filled', fillcolor='#e0e0e0')

dot.node('github', '🛠️ .github/', shape='folder')
dot.node('core', '🧠 project-core/', shape='folder')
dot.node('api', '🌐 project-api/', shape='folder')
dot.node('ui', '🎨 project-ui/', shape='folder')
dot.node('utils', '🔧 project-utils/', shape='folder')
dot.node('docs', '📚 docs/', shape='folder')
dot.node('pom', '📦 pom.xml', shape='note')
dot.node('readme', '📘 README.md', shape='note')

# Connect all folders to the root workspace
for node in ['github', 'core', 'api', 'ui', 'utils', 'docs', 'pom', 'readme']:
    dot.edge('workspace', node)

# Save the image
image_path = 'java_workspace_structure.png'
dot.render(image_path, format='png', cleanup=True)

# Optional: Display the image (requires PIL)
Image.open(image_path).show()
